package io.burkard.cdk.services.pinpointemail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDedicatedIpPoolProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool.TagsProperty]] = None,
    poolName: Option[String] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps =
    (new software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .poolName(poolName.orNull)
      .build()
}
