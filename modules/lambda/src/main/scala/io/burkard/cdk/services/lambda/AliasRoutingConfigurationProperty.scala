package io.burkard.cdk.services.lambda

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AliasRoutingConfigurationProperty {

  def apply(
    additionalVersionWeights: Option[List[_]] = None
  ): software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty =
    (new software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty.Builder)
      .additionalVersionWeights(additionalVersionWeights.map(_.asJava).orNull)
      .build()
}
