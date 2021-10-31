package io.burkard.cdk.services.redshift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParameterProperty {

  def apply(
    parameterValue: Option[String] = None,
    parameterName: Option[String] = None
  ): software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty =
    (new software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty.Builder)
      .parameterValue(parameterValue.orNull)
      .parameterName(parameterName.orNull)
      .build()
}
