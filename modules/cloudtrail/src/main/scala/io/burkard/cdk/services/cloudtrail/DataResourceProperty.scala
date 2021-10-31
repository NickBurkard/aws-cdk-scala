package io.burkard.cdk.services.cloudtrail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
