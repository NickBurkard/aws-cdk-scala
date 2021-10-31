package io.burkard.cdk.services.codegurureviewer

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRepositoryAssociationProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    connectionArn: Option[String] = None,
    owner: Option[String] = None,
    `type`: Option[String] = None,
    bucketName: Option[String] = None
  ): software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps =
    (new software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .connectionArn(connectionArn.orNull)
      .owner(owner.orNull)
      .`type`(`type`.orNull)
      .bucketName(bucketName.orNull)
      .build()
}
