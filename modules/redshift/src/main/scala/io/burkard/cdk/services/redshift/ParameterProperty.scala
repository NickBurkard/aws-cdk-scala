package io.burkard.cdk.services.redshift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParameterProperty {

  def apply(
    parameterValue: String,
    parameterName: String
  ): software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty =
    (new software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty.Builder)
      .parameterValue(parameterValue)
      .parameterName(parameterName)
      .build()
}
