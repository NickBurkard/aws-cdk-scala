package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnNetworkInsightsAnalysis {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    filterInArns: Option[List[String]] = None,
    networkInsightsPathId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis =
    software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .filterInArns(filterInArns.map(_.asJava).orNull)
      .networkInsightsPathId(networkInsightsPathId.orNull)
      .build()
}
