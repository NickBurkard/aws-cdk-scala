package io.burkard.cdk.core

sealed abstract class AssetHashType(val underlying: software.amazon.awscdk.AssetHashType)
  extends Product
    with Serializable

@scala.annotation.nowarn("cat=deprecation")
object AssetHashType {
  implicit def toAws(value: AssetHashType): software.amazon.awscdk.AssetHashType =
    Option(value).map(_.underlying).orNull

  case object Source
    extends AssetHashType(software.amazon.awscdk.AssetHashType.SOURCE)

  case object Bundle
    extends AssetHashType(software.amazon.awscdk.AssetHashType.BUNDLE)

  case object Output
    extends AssetHashType(software.amazon.awscdk.AssetHashType.OUTPUT)

  case object Custom
    extends AssetHashType(software.amazon.awscdk.AssetHashType.CUSTOM)
}
