#line 1 "trial301.c"
#line 1 "c:\\workspace\\hinotori_wakisaka\\c\\trial301\\trial301.h"

extern int torikondekure;
#line 2 "trial301.c"
#line 1 "C:\\Vc7\\include\\stdio.h"















#pragma once
#line 18 "C:\\Vc7\\include\\stdio.h"






#line 25 "C:\\Vc7\\include\\stdio.h"







#pragma pack(push,8)
#line 34 "C:\\Vc7\\include\\stdio.h"











#line 46 "C:\\Vc7\\include\\stdio.h"
#line 47 "C:\\Vc7\\include\\stdio.h"








#line 56 "C:\\Vc7\\include\\stdio.h"
#line 57 "C:\\Vc7\\include\\stdio.h"






#line 64 "C:\\Vc7\\include\\stdio.h"






typedef __w64 unsigned int   size_t;
#line 72 "C:\\Vc7\\include\\stdio.h"

#line 74 "C:\\Vc7\\include\\stdio.h"



typedef unsigned short wchar_t;

#line 80 "C:\\Vc7\\include\\stdio.h"



typedef unsigned short wint_t;
typedef unsigned short wctype_t;

#line 87 "C:\\Vc7\\include\\stdio.h"









typedef char *  va_list;
#line 98 "C:\\Vc7\\include\\stdio.h"

#line 100 "C:\\Vc7\\include\\stdio.h"

























struct _iobuf {
        char *_ptr;
        int   _cnt;
        char *_base;
        int   _flag;
        int   _file;
        int   _charbuf;
        int   _bufsiz;
        char *_tmpfname;
        };
typedef struct _iobuf FILE;

#line 138 "C:\\Vc7\\include\\stdio.h"










#line 149 "C:\\Vc7\\include\\stdio.h"



































#line 185 "C:\\Vc7\\include\\stdio.h"
#line 186 "C:\\Vc7\\include\\stdio.h"





 extern FILE _iob[];
#line 193 "C:\\Vc7\\include\\stdio.h"










#line 204 "C:\\Vc7\\include\\stdio.h"


typedef __int64 fpos_t;







#line 215 "C:\\Vc7\\include\\stdio.h"
#line 216 "C:\\Vc7\\include\\stdio.h"


#line 219 "C:\\Vc7\\include\\stdio.h"




























 int __cdecl _filbuf(FILE *);
 int __cdecl _flsbuf(int, FILE *);




 FILE * __cdecl _fsopen(const char *, const char *, int);
#line 255 "C:\\Vc7\\include\\stdio.h"

 void __cdecl clearerr(FILE *);
 int __cdecl fclose(FILE *);
 int __cdecl _fcloseall(void);




 FILE * __cdecl _fdopen(int, const char *);
#line 265 "C:\\Vc7\\include\\stdio.h"

 int __cdecl feof(FILE *);
 int __cdecl ferror(FILE *);
 int __cdecl fflush(FILE *);
 int __cdecl fgetc(FILE *);
 int __cdecl _fgetchar(void);
 int __cdecl fgetpos(FILE *, fpos_t *);
 char * __cdecl fgets(char *, int, FILE *);




 int __cdecl _fileno(FILE *);
#line 279 "C:\\Vc7\\include\\stdio.h"

 int __cdecl _flushall(void);
 FILE * __cdecl fopen(const char *, const char *);
 int __cdecl fprintf(FILE *, const char *, ...);
 int __cdecl fputc(int, FILE *);
 int __cdecl _fputchar(int);
 int __cdecl fputs(const char *, FILE *);
 size_t __cdecl fread(void *, size_t, size_t, FILE *);
 FILE * __cdecl freopen(const char *, const char *, FILE *);
 int __cdecl fscanf(FILE *, const char *, ...);
 int __cdecl fsetpos(FILE *, const fpos_t *);
 int __cdecl fseek(FILE *, long, int);
 long __cdecl ftell(FILE *);
 size_t __cdecl fwrite(const void *, size_t, size_t, FILE *);
 int __cdecl getc(FILE *);
 int __cdecl getchar(void);
 int __cdecl _getmaxstdio(void);
 char * __cdecl gets(char *);
 int __cdecl _getw(FILE *);
 void __cdecl perror(const char *);
 int __cdecl _pclose(FILE *);
 FILE * __cdecl _popen(const char *, const char *);
 int __cdecl printf(const char *, ...);
 int __cdecl putc(int, FILE *);
 int __cdecl putchar(int);
 int __cdecl puts(const char *);
 int __cdecl _putw(int, FILE *);
 int __cdecl remove(const char *);
 int __cdecl rename(const char *, const char *);
 void __cdecl rewind(FILE *);
 int __cdecl _rmtmp(void);
 int __cdecl scanf(const char *, ...);
 void __cdecl setbuf(FILE *, char *);
 int __cdecl _setmaxstdio(int);
 int __cdecl setvbuf(FILE *, char *, int, size_t);
 int __cdecl _snprintf(char *, size_t, const char *, ...);
 int __cdecl sprintf(char *, const char *, ...);
 int __cdecl _scprintf(const char *, ...);
 int __cdecl sscanf(const char *, const char *, ...);
 int __cdecl _snscanf(const char *, size_t, const char *, ...);
 char * __cdecl _tempnam(const char *, const char *);
 FILE * __cdecl tmpfile(void);
 char * __cdecl tmpnam(char *);
 int __cdecl ungetc(int, FILE *);
 int __cdecl _unlink(const char *);
 int __cdecl vfprintf(FILE *, const char *, va_list);
 int __cdecl vprintf(const char *, va_list);
 int __cdecl _vsnprintf(char *, size_t, const char *, va_list);
 int __cdecl vsprintf(char *, const char *, va_list);
 int __cdecl _vscprintf(const char *, va_list);







#line 337 "C:\\Vc7\\include\\stdio.h"




 FILE * __cdecl _wfsopen(const wchar_t *, const wchar_t *, int);
#line 343 "C:\\Vc7\\include\\stdio.h"

 wint_t __cdecl fgetwc(FILE *);
 wint_t __cdecl _fgetwchar(void);
 wint_t __cdecl fputwc(wchar_t, FILE *);
 wint_t __cdecl _fputwchar(wchar_t);
 wint_t __cdecl getwc(FILE *);
 wint_t __cdecl getwchar(void);
 wint_t __cdecl putwc(wchar_t, FILE *);
 wint_t __cdecl putwchar(wchar_t);
 wint_t __cdecl ungetwc(wint_t, FILE *);

 wchar_t * __cdecl fgetws(wchar_t *, int, FILE *);
 int __cdecl fputws(const wchar_t *, FILE *);
 wchar_t * __cdecl _getws(wchar_t *);
 int __cdecl _putws(const wchar_t *);

 int __cdecl fwprintf(FILE *, const wchar_t *, ...);
 int __cdecl wprintf(const wchar_t *, ...);
 int __cdecl _snwprintf(wchar_t *, size_t, const wchar_t *, ...);
 int __cdecl swprintf(wchar_t *, const wchar_t *, ...);
 int __cdecl _scwprintf(const wchar_t *, ...);
 int __cdecl vfwprintf(FILE *, const wchar_t *, va_list);
 int __cdecl vwprintf(const wchar_t *, va_list);
 int __cdecl _vsnwprintf(wchar_t *, size_t, const wchar_t *, va_list);
 int __cdecl vswprintf(wchar_t *, const wchar_t *, va_list);
 int __cdecl _vscwprintf(const wchar_t *, va_list);
 int __cdecl fwscanf(FILE *, const wchar_t *, ...);
 int __cdecl swscanf(const wchar_t *, const wchar_t *, ...);
 int __cdecl _snwscanf(const wchar_t *, size_t, const wchar_t *, ...);
 int __cdecl wscanf(const wchar_t *, ...);






 FILE * __cdecl _wfdopen(int, const wchar_t *);
 FILE * __cdecl _wfopen(const wchar_t *, const wchar_t *);
 FILE * __cdecl _wfreopen(const wchar_t *, const wchar_t *, FILE *);
 void __cdecl _wperror(const wchar_t *);
 FILE * __cdecl _wpopen(const wchar_t *, const wchar_t *);
 int __cdecl _wremove(const wchar_t *);
 wchar_t * __cdecl _wtempnam(const wchar_t *, const wchar_t *);
 wchar_t * __cdecl _wtmpnam(wchar_t *);



#line 391 "C:\\Vc7\\include\\stdio.h"


#line 394 "C:\\Vc7\\include\\stdio.h"
































 int __cdecl fcloseall(void);
 FILE * __cdecl fdopen(int, const char *);
 int __cdecl fgetchar(void);
 int __cdecl fileno(FILE *);
 int __cdecl flushall(void);
 int __cdecl fputchar(int);
 int __cdecl getw(FILE *);
 int __cdecl putw(int, FILE *);
 int __cdecl rmtmp(void);
 char * __cdecl tempnam(const char *, const char *);
 int __cdecl unlink(const char *);

#line 439 "C:\\Vc7\\include\\stdio.h"






#pragma pack(pop)
#line 447 "C:\\Vc7\\include\\stdio.h"

#line 449 "C:\\Vc7\\include\\stdio.h"
#line 3 "trial301.c"
int main(void)
{
printf("�w�b�_�t�@�C����荞�݃e�X�g\n");
return 0;
}
