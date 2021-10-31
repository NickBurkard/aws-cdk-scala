package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RelevanceProperty {

  def apply(
    duration: Option[String] = None,
    rankOrder: Option[String] = None,
    valueImportanceItems: Option[List[_]] = None,
    importance: Option[Number] = None,
    freshness: Option[Boolean] = None
  ): software.amazon.awscdk.services.kendra.CfnIndex.RelevanceProperty =
    (new software.amazon.awscdk.services.kendra.CfnIndex.RelevanceProperty.Builder)
      .duration(duration.orNull)
      .rankOrder(rankOrder.orNull)
      .valueImportanceItems(valueImportanceItems.map(_.asJava).orNull)
      .importance(importance.orNull)
      .freshness(freshness.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
