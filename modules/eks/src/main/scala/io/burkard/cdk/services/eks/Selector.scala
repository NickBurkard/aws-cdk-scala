package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Selector {

  def apply(
    namespace: String,
    labels: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.eks.Selector =
    (new software.amazon.awscdk.services.eks.Selector.Builder)
      .namespace(namespace)
      .labels(labels.map(_.asJava).orNull)
      .build()
}
