package io.burkard.cdk.services.codegurureviewer

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRepositoryAssociation {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    connectionArn: Option[String] = None,
    owner: Option[String] = None,
    `type`: Option[String] = None,
    bucketName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation =
    software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .connectionArn(connectionArn.orNull)
      .owner(owner.orNull)
      .`type`(`type`.orNull)
      .bucketName(bucketName.orNull)
      .build()
}
