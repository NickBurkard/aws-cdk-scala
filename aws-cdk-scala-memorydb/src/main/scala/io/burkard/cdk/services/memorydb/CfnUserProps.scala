package io.burkard.cdk.services.memorydb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUserProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    accessString: Option[String] = None,
    authenticationMode: Option[AnyRef] = None,
    userName: Option[String] = None
  ): software.amazon.awscdk.services.memorydb.CfnUserProps =
    (new software.amazon.awscdk.services.memorydb.CfnUserProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .accessString(accessString.orNull)
      .authenticationMode(authenticationMode.orNull)
      .userName(userName.orNull)
      .build()
}
