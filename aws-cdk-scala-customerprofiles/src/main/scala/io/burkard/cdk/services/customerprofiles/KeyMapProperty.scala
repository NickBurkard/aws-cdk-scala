package io.burkard.cdk.services.customerprofiles

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KeyMapProperty {

  def apply(
    name: Option[String] = None,
    objectTypeKeyList: Option[List[_]] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty.Builder)
      .name(name.orNull)
      .objectTypeKeyList(objectTypeKeyList.map(_.asJava).orNull)
      .build()
}
