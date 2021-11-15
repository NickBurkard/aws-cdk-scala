package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FilterProperty {

  def apply(
    deltaTime: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty.Builder)
      .deltaTime(deltaTime.orNull)
      .build()
}
