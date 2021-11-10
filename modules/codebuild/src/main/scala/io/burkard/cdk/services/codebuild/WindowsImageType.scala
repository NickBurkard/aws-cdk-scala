package io.burkard.cdk.services.codebuild


sealed abstract class WindowsImageType(val underlying: software.amazon.awscdk.services.codebuild.WindowsImageType)
  extends Product
    with Serializable


object WindowsImageType {
  implicit def toAws(value: WindowsImageType): software.amazon.awscdk.services.codebuild.WindowsImageType =
    Option(value).map(_.underlying).orNull

  case object Standard
    extends WindowsImageType(software.amazon.awscdk.services.codebuild.WindowsImageType.STANDARD)

  case object Server2019
    extends WindowsImageType(software.amazon.awscdk.services.codebuild.WindowsImageType.SERVER_2019)
}
