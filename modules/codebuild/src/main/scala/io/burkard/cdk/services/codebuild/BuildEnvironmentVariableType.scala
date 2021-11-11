package io.burkard.cdk.services.codebuild

sealed abstract class BuildEnvironmentVariableType(val underlying: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType)
  extends Product
    with Serializable

object BuildEnvironmentVariableType {
  implicit def toAws(value: BuildEnvironmentVariableType): software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType =
    Option(value).map(_.underlying).orNull

  case object Plaintext
    extends BuildEnvironmentVariableType(software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType.PLAINTEXT)

  case object ParameterStore
    extends BuildEnvironmentVariableType(software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType.PARAMETER_STORE)

  case object SecretsManager
    extends BuildEnvironmentVariableType(software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType.SECRETS_MANAGER)
}
