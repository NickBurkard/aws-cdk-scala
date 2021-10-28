package io.burkard.cdk.services.cloudtrail

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DataResourceProperty {

  def apply(
    values: Option[List[String]] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty =
    (new software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty.Builder)
      .values(values.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .build()
}
