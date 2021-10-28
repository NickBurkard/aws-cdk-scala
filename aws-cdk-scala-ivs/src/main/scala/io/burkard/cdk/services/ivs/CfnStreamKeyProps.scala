package io.burkard.cdk.services.ivs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStreamKeyProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    channelArn: Option[String] = None
  ): software.amazon.awscdk.services.ivs.CfnStreamKeyProps =
    (new software.amazon.awscdk.services.ivs.CfnStreamKeyProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .channelArn(channelArn.orNull)
      .build()
}
