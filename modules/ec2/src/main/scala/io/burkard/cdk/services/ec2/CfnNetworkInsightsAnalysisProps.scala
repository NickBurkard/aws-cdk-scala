package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnNetworkInsightsAnalysisProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    filterInArns: Option[List[String]] = None,
    networkInsightsPathId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .filterInArns(filterInArns.map(_.asJava).orNull)
      .networkInsightsPathId(networkInsightsPathId.orNull)
      .build()
}
