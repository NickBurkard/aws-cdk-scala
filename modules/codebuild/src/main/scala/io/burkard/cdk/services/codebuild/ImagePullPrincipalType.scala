package io.burkard.cdk.services.codebuild


sealed abstract class ImagePullPrincipalType(val underlying: software.amazon.awscdk.services.codebuild.ImagePullPrincipalType)
  extends Product
    with Serializable


object ImagePullPrincipalType {
  implicit def toAws(value: ImagePullPrincipalType): software.amazon.awscdk.services.codebuild.ImagePullPrincipalType =
    Option(value).map(_.underlying).orNull

  case object Codebuild
    extends ImagePullPrincipalType(software.amazon.awscdk.services.codebuild.ImagePullPrincipalType.CODEBUILD)

  case object ServiceRole
    extends ImagePullPrincipalType(software.amazon.awscdk.services.codebuild.ImagePullPrincipalType.SERVICE_ROLE)
}
