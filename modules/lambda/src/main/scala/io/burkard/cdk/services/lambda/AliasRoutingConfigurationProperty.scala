package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AliasRoutingConfigurationProperty {

  def apply(
    additionalVersionWeights: List[_]
  ): software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty =
    (new software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty.Builder)
      .additionalVersionWeights(additionalVersionWeights.asJava)
      .build()
}
