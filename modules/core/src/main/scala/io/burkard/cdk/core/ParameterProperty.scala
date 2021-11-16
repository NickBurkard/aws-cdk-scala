package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParameterProperty {

  def apply(
    parameterKey: String,
    parameterValue: String
  ): software.amazon.awscdk.CfnStackSet.ParameterProperty =
    (new software.amazon.awscdk.CfnStackSet.ParameterProperty.Builder)
      .parameterKey(parameterKey)
      .parameterValue(parameterValue)
      .build()
}
