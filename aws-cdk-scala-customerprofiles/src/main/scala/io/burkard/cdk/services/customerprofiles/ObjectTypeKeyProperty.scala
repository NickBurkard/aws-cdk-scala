package io.burkard.cdk.services.customerprofiles

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ObjectTypeKeyProperty {

  def apply(
    standardIdentifiers: Option[List[String]] = None,
    fieldNames: Option[List[String]] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty.Builder)
      .standardIdentifiers(standardIdentifiers.map(_.asJava).orNull)
      .fieldNames(fieldNames.map(_.asJava).orNull)
      .build()
}
