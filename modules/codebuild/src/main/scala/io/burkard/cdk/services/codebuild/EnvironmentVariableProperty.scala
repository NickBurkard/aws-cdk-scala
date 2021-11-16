package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EnvironmentVariableProperty {

  def apply(
    name: String,
    value: String,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty.Builder)
      .name(name)
      .value(value)
      .`type`(`type`.orNull)
      .build()
}
