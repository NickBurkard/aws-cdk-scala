package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BuildEnvironmentVariable {

  def apply(
    `type`: Option[software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType] = None,
    value: Option[AnyRef] = None
  ): software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable =
    (new software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable.Builder)
      .`type`(`type`.orNull)
      .value(value.orNull)
      .build()
}
