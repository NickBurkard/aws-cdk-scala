package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AwsAuthMapping {

  def apply(
    groups: List[String],
    username: Option[String] = None
  ): software.amazon.awscdk.services.eks.AwsAuthMapping =
    (new software.amazon.awscdk.services.eks.AwsAuthMapping.Builder)
      .groups(groups.asJava)
      .username(username.orNull)
      .build()
}
