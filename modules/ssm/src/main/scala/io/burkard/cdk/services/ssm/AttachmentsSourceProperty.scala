package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AttachmentsSourceProperty {

  def apply(
    name: Option[String] = None,
    key: Option[String] = None,
    values: Option[List[String]] = None
  ): software.amazon.awscdk.services.ssm.CfnDocument.AttachmentsSourceProperty =
    (new software.amazon.awscdk.services.ssm.CfnDocument.AttachmentsSourceProperty.Builder)
      .name(name.orNull)
      .key(key.orNull)
      .values(values.map(_.asJava).orNull)
      .build()
}
