package io.burkard.cdk.services.eks

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Selector {

  def apply(
    labels: Option[Map[String, String]] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.eks.Selector =
    (new software.amazon.awscdk.services.eks.Selector.Builder)
      .labels(labels.map(_.asJava).orNull)
      .namespace(namespace.orNull)
      .build()
}
