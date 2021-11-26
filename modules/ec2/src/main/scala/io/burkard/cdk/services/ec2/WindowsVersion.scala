package io.burkard.cdk.services.ec2

sealed abstract class WindowsVersion(val underlying: software.amazon.awscdk.services.ec2.WindowsVersion)
  extends Product
    with Serializable

@scala.annotation.nowarn("cat=deprecation")
object WindowsVersion {
  implicit def toAws(value: WindowsVersion): software.amazon.awscdk.services.ec2.WindowsVersion =
    Option(value).map(_.underlying).orNull

  case object WindowsServer1709EnglishCoreBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_1709_ENGLISH_CORE_BASE)

  case object WindowsServer1709EnglishCoreContainerslatest
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_1709_ENGLISH_CORE_CONTAINERSLATEST)

  case object WindowsServer1803EnglishCoreBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_1803_ENGLISH_CORE_BASE)

  case object WindowsServer1803EnglishCoreContainerslatest
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_1803_ENGLISH_CORE_CONTAINERSLATEST)

  case object WindowsServer1809EnglishCoreBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_1809_ENGLISH_CORE_BASE)

  case object WindowsServer1809EnglishCoreContainerslatest
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_1809_ENGLISH_CORE_CONTAINERSLATEST)

  case object WindowsServer2003R2Sp2English32bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2003_R2_SP2_ENGLISH_32BIT_BASE)

  case object WindowsServer2003R2Sp2English64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2003_R2_SP2_ENGLISH_64BIT_BASE)

  case object WindowsServer2003R2Sp2English64bitSql2005Sp4Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2003_R2_SP2_ENGLISH_64BIT_SQL_2005_SP4_EXPRESS)

  case object WindowsServer2003R2Sp2English64bitSql2005Sp4Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2003_R2_SP2_ENGLISH_64BIT_SQL_2005_SP4_STANDARD)

  case object WindowsServer2003R2Sp2LanguagePacks32bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2003_R2_SP2_LANGUAGE_PACKS_32BIT_BASE)

  case object WindowsServer2003R2Sp2LanguagePacks64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2003_R2_SP2_LANGUAGE_PACKS_64BIT_BASE)

  case object WindowsServer2003R2Sp2LanguagePacks64bitSql2005Sp4Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2003_R2_SP2_LANGUAGE_PACKS_64BIT_SQL_2005_SP4_EXPRESS)

  case object WindowsServer2003R2Sp2LanguagePacks64bitSql2005Sp4Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2003_R2_SP2_LANGUAGE_PACKS_64BIT_SQL_2005_SP4_STANDARD)

  case object WindowsServer2007R2Sp1LanguagePacks64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2007_R2_SP1_LANGUAGE_PACKS_64BIT_BASE)

  case object WindowsServer2008R2Sp1ChineseHongKongSar64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_CHINESE_HONG_KONG_SAR_64BIT_BASE)

  case object WindowsServer2008R2Sp1ChinesePrc64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_CHINESE_PRC_64BIT_BASE)

  case object WindowsServer2008R2Sp1English61bitSql2012RtmSp2Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_61BIT_SQL_2012_RTM_SP2_ENTERPRISE)

  case object WindowsServer2008R2Sp1English64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_BASE)

  case object WindowsServer2008R2Sp1English64bitCore
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_CORE)

  case object WindowsServer2008R2Sp1English64bitCoreSql2012Sp4Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_CORE_SQL_2012_SP4_STANDARD)

  case object WindowsServer2008R2Sp1English64bitSharepoint2010Sp2Foundation
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SHAREPOINT_2010_SP2_FOUNDATION)

  case object WindowsServer2008R2Sp1English64bitSql2008R2Sp3Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2008_R2_SP3_EXPRESS)

  case object WindowsServer2008R2Sp1English64bitSql2008R2Sp3Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2008_R2_SP3_STANDARD)

  case object WindowsServer2008R2Sp1English64bitSql2008R2Sp3Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2008_R2_SP3_WEB)

  case object WindowsServer2008R2Sp1English64bitSql2012Sp4Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2012_SP4_ENTERPRISE)

  case object WindowsServer2008R2Sp1English64bitSql2012Sp4Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2012_SP4_EXPRESS)

  case object WindowsServer2008R2Sp1English64bitSql2012Sp4Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2012_SP4_STANDARD)

  case object WindowsServer2008R2Sp1English64bitSql2012Sp4Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2012_SP4_WEB)

  case object WindowsServer2008R2Sp1Japanese64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_BASE)

  case object WindowsServer2008R2Sp1Japanese64bitSql2008R2Sp3Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2008_R2_SP3_EXPRESS)

  case object WindowsServer2008R2Sp1Japanese64bitSql2008R2Sp3Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2008_R2_SP3_STANDARD)

  case object WindowsServer2008R2Sp1Japanese64bitSql2008R2Sp3Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2008_R2_SP3_WEB)

  case object WindowsServer2008R2Sp1Japanese64bitSql2012Sp4Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2012_SP4_EXPRESS)

  case object WindowsServer2008R2Sp1Japanese64bitSql2012Sp4Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2012_SP4_STANDARD)

  case object WindowsServer2008R2Sp1Korean64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_KOREAN_64BIT_BASE)

  case object WindowsServer2008R2Sp1LanguagePacks64bitSql2008R2Sp3Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_LANGUAGE_PACKS_64BIT_SQL_2008_R2_SP3_EXPRESS)

  case object WindowsServer2008R2Sp1LanguagePacks64bitSql2008R2Sp3Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_LANGUAGE_PACKS_64BIT_SQL_2008_R2_SP3_STANDARD)

  case object WindowsServer2008R2Sp1PortugeseBrazil64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_R2_SP1_PORTUGESE_BRAZIL_64BIT_BASE)

  case object WindowsServer2008Sp2English32bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_SP2_ENGLISH_32BIT_BASE)

  case object WindowsServer2008Sp2English64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_SP2_ENGLISH_64BIT_BASE)

  case object WindowsServer2008Sp2English64bitSql2008Sp4Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_SP2_ENGLISH_64BIT_SQL_2008_SP4_EXPRESS)

  case object WindowsServer2008Sp2English64bitSql2008Sp4Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_SP2_ENGLISH_64BIT_SQL_2008_SP4_STANDARD)

  case object WindowsServer2008Sp2PortugeseBrazil32bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2008_SP2_PORTUGESE_BRAZIL_32BIT_BASE)

  case object WindowsServer2012R2RtmChineseSimplified64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_CHINESE_SIMPLIFIED_64BIT_BASE)

  case object WindowsServer2012R2RtmChineseTraditional64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_CHINESE_TRADITIONAL_64BIT_BASE)

  case object WindowsServer2012R2RtmChineseTraditionalHongKong64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_CHINESE_TRADITIONAL_HONG_KONG_64BIT_BASE)

  case object WindowsServer2012R2RtmCzech64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_CZECH_64BIT_BASE)

  case object WindowsServer2012R2RtmDutch64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_DUTCH_64BIT_BASE)

  case object WindowsServer2012R2RtmEnglish64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_BASE)

  case object WindowsServer2012R2RtmEnglish64bitCore
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_CORE)

  case object WindowsServer2012R2RtmEnglish64bitHyperv
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_HYPERV)

  case object WindowsServer2012R2RtmEnglish64bitSql2012Sp4Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2012_SP4_ENTERPRISE)

  case object WindowsServer2012R2RtmEnglish64bitSql2014Sp2Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP2_ENTERPRISE)

  case object WindowsServer2012R2RtmEnglish64bitSql2014Sp2Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP2_EXPRESS)

  case object WindowsServer2012R2RtmEnglish64bitSql2014Sp2Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP2_STANDARD)

  case object WindowsServer2012R2RtmEnglish64bitSql2014Sp2Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP2_WEB)

  case object WindowsServer2012R2RtmEnglish64bitSql2014Sp3Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP3_ENTERPRISE)

  case object WindowsServer2012R2RtmEnglish64bitSql2014Sp3Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP3_EXPRESS)

  case object WindowsServer2012R2RtmEnglish64bitSql2014Sp3Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP3_STANDARD)

  case object WindowsServer2012R2RtmEnglish64bitSql2014Sp3Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP3_WEB)

  case object WindowsServer2012R2RtmEnglish64bitSql2016Sp1Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP1_ENTERPRISE)

  case object WindowsServer2012R2RtmEnglish64bitSql2016Sp1Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP1_EXPRESS)

  case object WindowsServer2012R2RtmEnglish64bitSql2016Sp1Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP1_STANDARD)

  case object WindowsServer2012R2RtmEnglish64bitSql2016Sp1Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP1_WEB)

  case object WindowsServer2012R2RtmEnglish64bitSql2016Sp2Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP2_ENTERPRISE)

  case object WindowsServer2012R2RtmEnglish64bitSql2016Sp2Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP2_EXPRESS)

  case object WindowsServer2012R2RtmEnglish64bitSql2016Sp2Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP2_STANDARD)

  case object WindowsServer2012R2RtmEnglish64bitSql2016Sp2Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP2_WEB)

  case object WindowsServer2012R2RtmEnglishDeepLearning
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_DEEP_LEARNING)

  case object WindowsServer2012R2RtmEnglishP3
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ENGLISH_P3)

  case object WindowsServer2012R2RtmFrench64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_FRENCH_64BIT_BASE)

  case object WindowsServer2012R2RtmGerman64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_GERMAN_64BIT_BASE)

  case object WindowsServer2012R2RtmHungarian64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_HUNGARIAN_64BIT_BASE)

  case object WindowsServer2012R2RtmItalian64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_ITALIAN_64BIT_BASE)

  case object WindowsServer2012R2RtmJapanese64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_BASE)

  case object WindowsServer2012R2RtmJapanese64bitSql2014Sp2Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2014_SP2_EXPRESS)

  case object WindowsServer2012R2RtmJapanese64bitSql2014Sp2Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2014_SP2_STANDARD)

  case object WindowsServer2012R2RtmJapanese64bitSql2014Sp3Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2014_SP3_EXPRESS)

  case object WindowsServer2012R2RtmJapanese64bitSql2014Sp3Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2014_SP3_STANDARD)

  case object WindowsServer2012R2RtmJapanese64bitSql2016Sp1Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP1_ENTERPRISE)

  case object WindowsServer2012R2RtmJapanese64bitSql2016Sp1Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP1_EXPRESS)

  case object WindowsServer2012R2RtmJapanese64bitSql2016Sp1Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP1_STANDARD)

  case object WindowsServer2012R2RtmJapanese64bitSql2016Sp1Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP1_WEB)

  case object WindowsServer2012R2RtmJapanese64bitSql2016Sp2Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP2_ENTERPRISE)

  case object WindowsServer2012R2RtmJapanese64bitSql2016Sp2Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP2_STANDARD)

  case object WindowsServer2012R2RtmJapanese64bitSql2016Sp2Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP2_WEB)

  case object WindowsServer2012R2RtmKorean64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_KOREAN_64BIT_BASE)

  case object WindowsServer2012R2RtmPolish64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_POLISH_64BIT_BASE)

  case object WindowsServer2012R2RtmPortugeseBrazil64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_PORTUGESE_BRAZIL_64BIT_BASE)

  case object WindowsServer2012R2RtmPortugesePortugal64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_PORTUGESE_PORTUGAL_64BIT_BASE)

  case object WindowsServer2012R2RtmRussian64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_RUSSIAN_64BIT_BASE)

  case object WindowsServer2012R2RtmSpanish64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_SPANISH_64BIT_BASE)

  case object WindowsServer2012R2RtmSwedish64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_SWEDISH_64BIT_BASE)

  case object WindowsServer2012R2RtmTurkish64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_RTM_TURKISH_64BIT_BASE)

  case object WindowsServer2012R2Sp1PortugeseBrazil64bitCore
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_R2_SP1_PORTUGESE_BRAZIL_64BIT_CORE)

  case object WindowsServer2012RtmChineseSimplified64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_CHINESE_SIMPLIFIED_64BIT_BASE)

  case object WindowsServer2012RtmChineseTraditional64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_CHINESE_TRADITIONAL_64BIT_BASE)

  case object WindowsServer2012RtmChineseTraditionalHongKongSar64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_CHINESE_TRADITIONAL_HONG_KONG_SAR_64BIT_BASE)

  case object WindowsServer2012RtmCzech64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_CZECH_64BIT_BASE)

  case object WindowsServer2012RtmDutch64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_DUTCH_64BIT_BASE)

  case object WindowsServer2012RtmEnglish64bit2014Sp3Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_2014_SP3_WEB)

  case object WindowsServer2012RtmEnglish64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_BASE)

  case object WindowsServer2012RtmEnglish64bitSql2007R2Sp3Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2007_R2_SP3_WEB)

  case object WindowsServer2012RtmEnglish64bitSql2008R2Sp3Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2008_R2_SP3_EXPRESS)

  case object WindowsServer2012RtmEnglish64bitSql2008R2Sp3Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2008_R2_SP3_STANDARD)

  case object WindowsServer2012RtmEnglish64bitSql2012Sp4Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2012_SP4_EXPRESS)

  case object WindowsServer2012RtmEnglish64bitSql2012Sp4Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2012_SP4_STANDARD)

  case object WindowsServer2012RtmEnglish64bitSql2012Sp4Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2012_SP4_WEB)

  case object WindowsServer2012RtmEnglish64bitSql2014Sp2Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP2_EXPRESS)

  case object WindowsServer2012RtmEnglish64bitSql2014Sp2Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP2_STANDARD)

  case object WindowsServer2012RtmEnglish64bitSql2014Sp2Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP2_WEB)

  case object WindowsServer2012RtmEnglish64bitSql2014Sp3Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP3_EXPRESS)

  case object WindowsServer2012RtmEnglish64bitSql2014Sp3Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP3_STANDARD)

  case object WindowsServer2012RtmFrench64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_FRENCH_64BIT_BASE)

  case object WindowsServer2012RtmGerman64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_GERMAN_64BIT_BASE)

  case object WindowsServer2012RtmHungarian64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_HUNGARIAN_64BIT_BASE)

  case object WindowsServer2012RtmItalian64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_ITALIAN_64BIT_BASE)

  case object WindowsServer2012RtmJapanese64bit2012Sp4Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_2012_SP4_STANDARD)

  case object WindowsServer2012RtmJapanese64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_BASE)

  case object WindowsServer2012RtmJapanese64bitSql2008R2Sp3Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2008_R2_SP3_EXPRESS)

  case object WindowsServer2012RtmJapanese64bitSql2008R2Sp3Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2008_R2_SP3_STANDARD)

  case object WindowsServer2012RtmJapanese64bitSql2012Sp4Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2012_SP4_EXPRESS)

  case object WindowsServer2012RtmJapanese64bitSql2012Sp4Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2012_SP4_WEB)

  case object WindowsServer2012RtmJapanese64bitSql2014Sp2Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP2_EXPRESS)

  case object WindowsServer2012RtmJapanese64bitSql2014Sp2Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP2_STANDARD)

  case object WindowsServer2012RtmJapanese64bitSql2014Sp2Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP2_WEB)

  case object WindowsServer2012RtmJapanese64bitSql2014Sp3Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP3_EXPRESS)

  case object WindowsServer2012RtmJapanese64bitSql2014Sp3Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP3_STANDARD)

  case object WindowsServer2012RtmJapanese64bitSql2014Sp3Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP3_WEB)

  case object WindowsServer2012RtmJapanese64bitSql2016Sp2Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2016_SP2_EXPRESS)

  case object WindowsServer2012RtmKorean64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_KOREAN_64BIT_BASE)

  case object WindowsServer2012RtmPolish64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_POLISH_64BIT_BASE)

  case object WindowsServer2012RtmPortugeseBrazil64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_PORTUGESE_BRAZIL_64BIT_BASE)

  case object WindowsServer2012RtmPortugesePortugal64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_PORTUGESE_PORTUGAL_64BIT_BASE)

  case object WindowsServer2012RtmRussian64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_RUSSIAN_64BIT_BASE)

  case object WindowsServer2012RtmSpanish64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_SPANISH_64BIT_BASE)

  case object WindowsServer2012RtmSwedish64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_SWEDISH_64BIT_BASE)

  case object WindowsServer2012RtmTurkish64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_RTM_TURKISH_64BIT_BASE)

  case object WindowsServer2012Sp2PortugeseBrazil64bitBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2012_SP2_PORTUGESE_BRAZIL_64BIT_BASE)

  case object WindowsServer2016ChineseSimplifiedFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_CHINESE_SIMPLIFIED_FULL_BASE)

  case object WindowsServer2016ChineseTraditionalFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_CHINESE_TRADITIONAL_FULL_BASE)

  case object WindowsServer2016CzechFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_CZECH_FULL_BASE)

  case object WindowsServer2016DutchFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_DUTCH_FULL_BASE)

  case object WindowsServer2016English64bitSql2012Sp4Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_64BIT_SQL_2012_SP4_ENTERPRISE)

  case object WindowsServer2016EnglishCoreBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_BASE)

  case object WindowsServer2016EnglishCoreContainers
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_CONTAINERS)

  case object WindowsServer2016EnglishCoreContainerslatest
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_CONTAINERSLATEST)

  case object WindowsServer2016EnglishCoreSql2016Sp1Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP1_ENTERPRISE)

  case object WindowsServer2016EnglishCoreSql2016Sp1Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP1_EXPRESS)

  case object WindowsServer2016EnglishCoreSql2016Sp1Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP1_STANDARD)

  case object WindowsServer2016EnglishCoreSql2016Sp1Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP1_WEB)

  case object WindowsServer2016EnglishCoreSql2016Sp2Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP2_ENTERPRISE)

  case object WindowsServer2016EnglishCoreSql2016Sp2Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP2_EXPRESS)

  case object WindowsServer2016EnglishCoreSql2016Sp2Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP2_STANDARD)

  case object WindowsServer2016EnglishCoreSql2016Sp2Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP2_WEB)

  case object WindowsServer2016EnglishDeepLearning
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_DEEP_LEARNING)

  case object WindowsServer2016EnglishFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_BASE)

  case object WindowsServer2016EnglishFullContainers
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_CONTAINERS)

  case object WindowsServer2016EnglishFullHyperv
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_HYPERV)

  case object WindowsServer2016EnglishFullSql2016Sp1Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP1_ENTERPRISE)

  case object WindowsServer2016EnglishFullSql2016Sp1Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP1_EXPRESS)

  case object WindowsServer2016EnglishFullSql2016Sp1Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP1_STANDARD)

  case object WindowsServer2016EnglishFullSql2016Sp1Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP1_WEB)

  case object WindowsServer2016EnglishFullSql2016Sp2Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP2_ENTERPRISE)

  case object WindowsServer2016EnglishFullSql2016Sp2Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP2_EXPRESS)

  case object WindowsServer2016EnglishFullSql2016Sp2Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP2_STANDARD)

  case object WindowsServer2016EnglishFullSql2016Sp2Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP2_WEB)

  case object WindowsServer2016EnglishFullSql2017Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2017_ENTERPRISE)

  case object WindowsServer2016EnglishFullSql2017Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2017_EXPRESS)

  case object WindowsServer2016EnglishFullSql2017Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2017_STANDARD)

  case object WindowsServer2016EnglishFullSql2017Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2017_WEB)

  case object WindowsServer2016EnglishP3
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ENGLISH_P3)

  case object WindowsServer2016FrenchFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_FRENCH_FULL_BASE)

  case object WindowsServer2016GermalFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_GERMAL_FULL_BASE)

  case object WindowsServer2016HungarianFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_HUNGARIAN_FULL_BASE)

  case object WindowsServer2016ItalianFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_ITALIAN_FULL_BASE)

  case object WindowsServer2016JapaneseFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_BASE)

  case object WindowsServer2016JapaneseFullFql2016Sp2Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_FQL_2016_SP2_WEB)

  case object WindowsServer2016JapaneseFullSql2016Sp1Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP1_ENTERPRISE)

  case object WindowsServer2016JapaneseFullSql2016Sp1Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP1_EXPRESS)

  case object WindowsServer2016JapaneseFullSql2016Sp1Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP1_STANDARD)

  case object WindowsServer2016JapaneseFullSql2016Sp1Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP1_WEB)

  case object WindowsServer2016JapaneseFullSql2016Sp2Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP2_ENTERPRISE)

  case object WindowsServer2016JapaneseFullSql2016Sp2Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP2_EXPRESS)

  case object WindowsServer2016JapaneseFullSql2016Sp2Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP2_STANDARD)

  case object WindowsServer2016KoreanFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_KOREAN_FULL_BASE)

  case object WindowsServer2016KoreanFullSql2016Sp1Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_KOREAN_FULL_SQL_2016_SP1_STANDARD)

  case object WindowsServer2016KoreanFullSql2016Sp2Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_KOREAN_FULL_SQL_2016_SP2_STANDARD)

  case object WindowsServer2016PolishFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_POLISH_FULL_BASE)

  case object WindowsServer2016PortugeseBrazilFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_PORTUGESE_BRAZIL_FULL_BASE)

  case object WindowsServer2016PortugesePortugalFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_PORTUGESE_PORTUGAL_FULL_BASE)

  case object WindowsServer2016RussianFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_RUSSIAN_FULL_BASE)

  case object WindowsServer2016SpanishFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_SPANISH_FULL_BASE)

  case object WindowsServer2016SwedishFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_SWEDISH_FULL_BASE)

  case object WindowsServer2016TurkishFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2016_TURKISH_FULL_BASE)

  case object WindowsServer2019ChineseSimplifiedFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_CHINESE_SIMPLIFIED_FULL_BASE)

  case object WindowsServer2019ChineseTraditionalFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_CHINESE_TRADITIONAL_FULL_BASE)

  case object WindowsServer2019CzechFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_CZECH_FULL_BASE)

  case object WindowsServer2019DutchFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_DUTCH_FULL_BASE)

  case object WindowsServer2019EnglishCoreBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_CORE_BASE)

  case object WindowsServer2019EnglishCoreContainerslatest
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_CORE_CONTAINERSLATEST)

  case object WindowsServer2019EnglishFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_BASE)

  case object WindowsServer2019EnglishFullContainerslatest
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_CONTAINERSLATEST)

  case object WindowsServer2019EnglishFullHyperv
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_HYPERV)

  case object WindowsServer2019EnglishFullSql2016Sp2Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP2_ENTERPRISE)

  case object WindowsServer2019EnglishFullSql2016Sp2Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP2_EXPRESS)

  case object WindowsServer2019EnglishFullSql2016Sp2Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP2_STANDARD)

  case object WindowsServer2019EnglishFullSql2016Sp2Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP2_WEB)

  case object WindowsServer2019EnglishFullSql2017Enterprise
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2017_ENTERPRISE)

  case object WindowsServer2019EnglishFullSql2017Express
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2017_EXPRESS)

  case object WindowsServer2019EnglishFullSql2017Standard
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2017_STANDARD)

  case object WindowsServer2019EnglishFullSql2017Web
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2017_WEB)

  case object WindowsServer2019FrenchFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_FRENCH_FULL_BASE)

  case object WindowsServer2019GermanFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_GERMAN_FULL_BASE)

  case object WindowsServer2019HungarianFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_HUNGARIAN_FULL_BASE)

  case object WindowsServer2019ItalianFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_ITALIAN_FULL_BASE)

  case object WindowsServer2019JapaneseFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_JAPANESE_FULL_BASE)

  case object WindowsServer2019KoreanFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_KOREAN_FULL_BASE)

  case object WindowsServer2019PolishFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_POLISH_FULL_BASE)

  case object WindowsServer2019PortugeseBrazilFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_PORTUGESE_BRAZIL_FULL_BASE)

  case object WindowsServer2019PortugesePortugalFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_PORTUGESE_PORTUGAL_FULL_BASE)

  case object WindowsServer2019RussianFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_RUSSIAN_FULL_BASE)

  case object WindowsServer2019SpanishFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_SPANISH_FULL_BASE)

  case object WindowsServer2019SwedishFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_SWEDISH_FULL_BASE)

  case object WindowsServer2019TurkishFullBase
    extends WindowsVersion(software.amazon.awscdk.services.ec2.WindowsVersion.WINDOWS_SERVER_2019_TURKISH_FULL_BASE)
}
