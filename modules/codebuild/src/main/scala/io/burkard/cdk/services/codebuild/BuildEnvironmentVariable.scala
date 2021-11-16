package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BuildEnvironmentVariable {

  def apply(
    value: AnyRef,
    `type`: Option[software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType] = None
  ): software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable =
    (new software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable.Builder)
      .value(value)
      .`type`(`type`.orNull)
      .build()
}
