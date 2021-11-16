package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParameterProperty {

  def apply(
    parameterKey: String,
    parameterValue: String
  ): software.amazon.awscdk.services.cloudformation.CfnStackSet.ParameterProperty =
    (new software.amazon.awscdk.services.cloudformation.CfnStackSet.ParameterProperty.Builder)
      .parameterKey(parameterKey)
      .parameterValue(parameterValue)
      .build()
}
