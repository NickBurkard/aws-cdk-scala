package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLocationObjectStorage {

  def apply(
    internalResourceId: String,
    agentArns: List[String],
    serverHostname: String,
    bucketName: String,
    serverPort: Option[Number] = None,
    accessKey: Option[String] = None,
    serverProtocol: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    subdirectory: Option[String] = None,
    secretKey: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.datasync.CfnLocationObjectStorage =
    software.amazon.awscdk.services.datasync.CfnLocationObjectStorage.Builder
      .create(stackCtx, internalResourceId)
      .agentArns(agentArns.asJava)
      .serverHostname(serverHostname)
      .bucketName(bucketName)
      .serverPort(serverPort.orNull)
      .accessKey(accessKey.orNull)
      .serverProtocol(serverProtocol.orNull)
      .tags(tags.map(_.asJava).orNull)
      .subdirectory(subdirectory.orNull)
      .secretKey(secretKey.orNull)
      .build()
}
