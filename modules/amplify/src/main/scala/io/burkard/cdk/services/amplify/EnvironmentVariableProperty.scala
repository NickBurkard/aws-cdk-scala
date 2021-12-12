package io.burkard.cdk.services.amplify

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EnvironmentVariableProperty {

  def apply(
    name: String,
    value: String
  ): software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty =
    (new software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty.Builder)
      .name(name)
      .value(value)
      .build()
}
