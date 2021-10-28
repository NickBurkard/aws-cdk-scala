package io.burkard.cdk.services.datasync

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLocationObjectStorageProps {

  def apply(
    serverPort: Option[Number] = None,
    agentArns: Option[List[String]] = None,
    serverHostname: Option[String] = None,
    accessKey: Option[String] = None,
    bucketName: Option[String] = None,
    serverProtocol: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    subdirectory: Option[String] = None,
    secretKey: Option[String] = None
  ): software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps =
    (new software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps.Builder)
      .serverPort(serverPort.orNull)
      .agentArns(agentArns.map(_.asJava).orNull)
      .serverHostname(serverHostname.orNull)
      .accessKey(accessKey.orNull)
      .bucketName(bucketName.orNull)
      .serverProtocol(serverProtocol.orNull)
      .tags(tags.map(_.asJava).orNull)
      .subdirectory(subdirectory.orNull)
      .secretKey(secretKey.orNull)
      .build()
}
