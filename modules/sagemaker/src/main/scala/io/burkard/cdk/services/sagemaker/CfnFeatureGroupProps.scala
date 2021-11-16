package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFeatureGroupProps {

  def apply(
    eventTimeFeatureName: String,
    featureDefinitions: List[_],
    recordIdentifierFeatureName: String,
    featureGroupName: String,
    offlineStoreConfig: Option[AnyRef] = None,
    roleArn: Option[String] = None,
    onlineStoreConfig: Option[AnyRef] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps =
    (new software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps.Builder)
      .eventTimeFeatureName(eventTimeFeatureName)
      .featureDefinitions(featureDefinitions.asJava)
      .recordIdentifierFeatureName(recordIdentifierFeatureName)
      .featureGroupName(featureGroupName)
      .offlineStoreConfig(offlineStoreConfig.orNull)
      .roleArn(roleArn.orNull)
      .onlineStoreConfig(onlineStoreConfig.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
