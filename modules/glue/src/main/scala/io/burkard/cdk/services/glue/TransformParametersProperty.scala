package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TransformParametersProperty {

  def apply(
    transformType: String,
    findMatchesParameters: Option[software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty] = None
  ): software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty =
    (new software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty.Builder)
      .transformType(transformType)
      .findMatchesParameters(findMatchesParameters.orNull)
      .build()
}
