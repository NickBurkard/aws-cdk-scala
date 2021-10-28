package io.burkard.cdk.pipelines

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WaveProps {

  def apply(
    pre: Option[List[_ <: software.amazon.awscdk.pipelines.Step]] = None,
    post: Option[List[_ <: software.amazon.awscdk.pipelines.Step]] = None
  ): software.amazon.awscdk.pipelines.WaveProps =
    (new software.amazon.awscdk.pipelines.WaveProps.Builder)
      .pre(pre.map(_.asJava).orNull)
      .post(post.map(_.asJava).orNull)
      .build()
}
