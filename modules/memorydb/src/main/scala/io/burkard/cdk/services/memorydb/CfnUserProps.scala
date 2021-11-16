package io.burkard.cdk.services.memorydb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserProps {

  def apply(
    accessString: String,
    authenticationMode: AnyRef,
    userName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.memorydb.CfnUserProps =
    (new software.amazon.awscdk.services.memorydb.CfnUserProps.Builder)
      .accessString(accessString)
      .authenticationMode(authenticationMode)
      .userName(userName)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
