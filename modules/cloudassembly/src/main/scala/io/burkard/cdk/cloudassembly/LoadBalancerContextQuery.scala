package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoadBalancerContextQuery {

  def apply(
    region: String,
    account: String,
    loadBalancerArn: Option[String] = None,
    loadBalancerType: Option[software.amazon.awscdk.cloudassembly.schema.LoadBalancerType] = None,
    lookupRoleArn: Option[String] = None,
    loadBalancerTags: Option[List[_ <: software.amazon.awscdk.cloudassembly.schema.Tag]] = None
  ): software.amazon.awscdk.cloudassembly.schema.LoadBalancerContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.LoadBalancerContextQuery.Builder)
      .region(region)
      .account(account)
      .loadBalancerArn(loadBalancerArn.orNull)
      .loadBalancerType(loadBalancerType.orNull)
      .lookupRoleArn(lookupRoleArn.orNull)
      .loadBalancerTags(loadBalancerTags.map(_.asJava).orNull)
      .build()
}
