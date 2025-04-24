@echo off
setlocal enabledelayedexpansion

:: Baca count dari file .count.txt, jika tidak ada mulai dari 1
set count=4
if exist .count.txt (
    set /p count=<.count.txt
)

:: Tampilkan count ke layar
echo Commit ke-%count%

:: Git commands
git add .
git commit -m "change !count!"
git push

:: Tambah count dan simpan kembali
set /a count+=1
echo !count! > .count.txt

endlocal