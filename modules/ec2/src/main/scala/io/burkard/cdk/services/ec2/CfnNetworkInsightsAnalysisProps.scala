package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNetworkInsightsAnalysisProps {

  def apply(
    networkInsightsPathId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    filterInArns: Option[List[String]] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps.Builder)
      .networkInsightsPathId(networkInsightsPathId)
      .tags(tags.map(_.asJava).orNull)
      .filterInArns(filterInArns.map(_.asJava).orNull)
      .build()
}
