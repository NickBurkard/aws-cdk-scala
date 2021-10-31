package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActivityProperty {

  def apply(
    channel: Option[software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty] = None,
    deviceShadowEnrich: Option[software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty] = None,
    lambda: Option[software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty] = None,
    filter: Option[software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty] = None,
    addAttributes: Option[software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty] = None,
    math: Option[software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty] = None,
    datastore: Option[software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty] = None,
    deviceRegistryEnrich: Option[software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty] = None,
    selectAttributes: Option[software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty] = None,
    removeAttributes: Option[software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder)
      .channel(channel.orNull)
      .deviceShadowEnrich(deviceShadowEnrich.orNull)
      .lambda(lambda.orNull)
      .filter(filter.orNull)
      .addAttributes(addAttributes.orNull)
      .math(math.orNull)
      .datastore(datastore.orNull)
      .deviceRegistryEnrich(deviceRegistryEnrich.orNull)
      .selectAttributes(selectAttributes.orNull)
      .removeAttributes(removeAttributes.orNull)
      .build()
}
