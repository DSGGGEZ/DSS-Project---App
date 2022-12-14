package com.example.dssproject;

public class QuestionAnswer {

    public static String easyquestion[]={
            "ตัวโตมี 4 ขา จมูกยาวส่ายไปมา กินกล้วยและอ้อยเป็นอาหาร",
            "คอยาว ขายาว ชอบกินยอดไม้",
            "ตัวยาวเลื้อยไปมา พิษมาก ร้ายแรง",
            "ตัวคล้ายๆแมว สีเหลืองสลับดำ",
            "ตัวเล็ก ซุกซน โหนต้นไม้ไว",
            "กางปีกโบยบิน อยู่บนท้องฟ้า เสียงร้องลงมา จิ๊บ จิ๊บ",
            "ตัวใหญ่ สีดำเงา ลอยกลางทะเล พ้นน้ำเป็นฝอย",
            "ตากลมโตแวววาว โบยบินกลางคืน",
            "ไม่ว่าเล็กหรือใหญ่ น่ารักทุกตัว ชอบอยู่เฝ้าบ้าน",
            "มีขนรอบหัว เขี้ยวเล็บแหลมคม ใครๆชื่นชม ฉันเป็นเจ้าป่า",
    };

    public static String easychoice[][] = {
            {"ควาย","ม้า","ว้ว","ช้าง"},
            {"แรด","กระทิง","ยีราฟ","อัลปาก้า"},
            {"มด","แมงมุม","ตะขาบ","งู"},
            {"แมวป่า","เสือ","ม้าลาย","ช้าง"},
            {"ลิง","ม้า","ไก่","นก"},
            {"ปลา","ปู","นก","หมู"},
            {"งู","แมงกระพรุน","แพลงกตอน","ปลาวาฬ"},
            {"ผึ้ง","ผีเสื้อ","นกฮูก","ตั๊กแตน"},
            {"สุนัข","เต่า","ควาย","เม่น"},
            {"ผีเสื้อ","ม้า","แมว","สิงโต"}

    };
    public static int correcteasychoice[] ={
            4,
            3,
            4,
            2,
            1,
            3,
            4,
            3,
            1,
            4,
    };
    //Hard Level
    public static String hardQuestion[] = {
            "สัตว์เลี้ยงลูกด้วยน้ำนมที่อยู่ในน้ำ คือข้อใด",
            "ข้อใดเป็นสิ่งสำคัญที่ทำให้นกบินได้",
            "การกบอยู่ในรูนิ่ง ๆ ในฤดูแล้ง เรียกว่าอย่างไร",
            "สัตว์ในข้อใดเป็นสัตว์เลือดอุ่นทั้งหมด",
            "ม้าน้ำจัดอยู่ในสัตว์พวกใด",
            "มีขนเป็นแผง  ออกลูกเป็นไข่",
            "ข้อใด ไม่ใช่ สัตว์ที่เลี้ยงลูกด้วยน้ำนม",
            "สัตว์ชนิดใดไม่จัดอยู่ในพวกสัตว์ปีก",
            "สัตว์ที่มีลักษณะการออกลูกเหมือนกัน",
            "ข้อใดที่เป็นลักษณะเหมือนกันของสัตว์ครึ่งน้ำครึ่งบกและสัตว์เลื้อยคลาน"

    };
    public static String hardChoice[][]={
            {"ปลาหมึก","ปลาโลมา","ปลากระเบน","ปลาไหล"},
            {"มีขน","มีตัวเล็ก","มีปีกกว้างใหญ่","กระดูกเป็นโพรง"},
            {"เตรียมผสมพันธุ์","สะสมพลัง","สงบนิ่ง","จำศีล"},
            {"เสือ  จระเข้","วัว กบ","กระรอก เต่า","ชะนี นกยูง"},
            {"พวกปลา","พวกสัตว์ทะเล","พวกสัตว์ทะเลผิวขรุขระ","พวกสัตว์เลี้ยงลูกด้วยนม"},
            {"สัตว์ปีก" ,"สัตว์เลื้อยคลาน" ,"สัตว์ครึ่งน้ำครึ่งบก" ,"สัตว์เลี้ยงลูกด้วยน้ำนม"},
            {"แมว", "กิ้งก่า" ,"ค้างคาว", "ปลาพะยูน"},
            {"นกแก้ว" ,"ค้างคาว", "นกขุนทอง", "นกกระจอกเทศ"},
            {"กบ  ไก่" ,"จระเข้ ลิง" ,"สุนัข ปลากัด", "ค้างคาว กระรอก"},
            {"การเคลื่อนที่" ,"ลักษณะของผิวหนัง" ,"ไข่มีเปลือกแข็งหุ้ม", "อุณหภูมิในร่างกาย"},
    };
    public static int correctHardChoice[]={
            2,
            4,
            4,
            4,
            1,
            1,
            2,
            2,
            4,
            4
    };
}
