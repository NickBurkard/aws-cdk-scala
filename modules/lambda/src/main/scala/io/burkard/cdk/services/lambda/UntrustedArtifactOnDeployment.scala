package io.burkard.cdk.services.lambda


sealed abstract class UntrustedArtifactOnDeployment(val underlying: software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment)
  extends Product
    with Serializable


object UntrustedArtifactOnDeployment {
  implicit def toAws(value: UntrustedArtifactOnDeployment): software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment =
    Option(value).map(_.underlying).orNull

  case object Enforce
    extends UntrustedArtifactOnDeployment(software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment.ENFORCE)

  case object Warn
    extends UntrustedArtifactOnDeployment(software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment.WARN)
}
