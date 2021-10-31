package io.burkard.cdk.services.memorydb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
