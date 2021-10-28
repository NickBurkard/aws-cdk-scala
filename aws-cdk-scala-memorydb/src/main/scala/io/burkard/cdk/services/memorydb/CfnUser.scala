package io.burkard.cdk.services.memorydb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUser {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    accessString: Option[String] = None,
    authenticationMode: Option[AnyRef] = None,
    userName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.memorydb.CfnUser =
    software.amazon.awscdk.services.memorydb.CfnUser.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .accessString(accessString.orNull)
      .authenticationMode(authenticationMode.orNull)
      .userName(userName.orNull)
      .build()
}
