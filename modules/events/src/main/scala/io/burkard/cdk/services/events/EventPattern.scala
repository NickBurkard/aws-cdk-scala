package io.burkard.cdk.services.events

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EventPattern {

  def apply(
    source: Option[List[String]] = None,
    version: Option[List[String]] = None,
    id: Option[List[String]] = None,
    detailType: Option[List[String]] = None,
    resources: Option[List[String]] = None,
    region: Option[List[String]] = None,
    detail: Option[Map[String, _]] = None,
    account: Option[List[String]] = None,
    time: Option[List[String]] = None
  ): software.amazon.awscdk.services.events.EventPattern =
    (new software.amazon.awscdk.services.events.EventPattern.Builder)
      .source(source.map(_.asJava).orNull)
      .version(version.map(_.asJava).orNull)
      .id(id.map(_.asJava).orNull)
      .detailType(detailType.map(_.asJava).orNull)
      .resources(resources.map(_.asJava).orNull)
      .region(region.map(_.asJava).orNull)
      .detail(detail.map(_.asJava).orNull)
      .account(account.map(_.asJava).orNull)
      .time(time.map(_.asJava).orNull)
      .build()
}
