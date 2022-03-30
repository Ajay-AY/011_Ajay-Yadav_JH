class Error{
static void d1(){
d2();
}

static void d2(){
d1();
}
public static void main (String... args){
d1();

}
}