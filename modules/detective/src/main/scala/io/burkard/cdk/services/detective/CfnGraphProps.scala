package io.burkard.cdk.services.detective

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGraphProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.detective.CfnGraphProps =
    (new software.amazon.awscdk.services.detective.CfnGraphProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
