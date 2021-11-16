package io.burkard.cdk.services.s3objectlambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ObjectLambdaConfigurationProperty {

  def apply(
    supportingAccessPoint: String,
    transformationConfigurations: List[_],
    cloudWatchMetricsEnabled: Option[Boolean] = None,
    allowedFeatures: Option[List[String]] = None
  ): software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty =
    (new software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty.Builder)
      .supportingAccessPoint(supportingAccessPoint)
      .transformationConfigurations(transformationConfigurations.asJava)
      .cloudWatchMetricsEnabled(cloudWatchMetricsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .allowedFeatures(allowedFeatures.map(_.asJava).orNull)
      .build()
}
