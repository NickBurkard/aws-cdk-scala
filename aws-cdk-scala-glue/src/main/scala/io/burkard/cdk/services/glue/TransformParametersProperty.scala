package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TransformParametersProperty {

  def apply(
    findMatchesParameters: Option[software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty] = None,
    transformType: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty =
    (new software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty.Builder)
      .findMatchesParameters(findMatchesParameters.orNull)
      .transformType(transformType.orNull)
      .build()
}
