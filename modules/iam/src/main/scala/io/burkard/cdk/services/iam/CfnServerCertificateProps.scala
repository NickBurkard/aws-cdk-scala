package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnServerCertificateProps {

  def apply(
    path: Option[String] = None,
    certificateBody: Option[String] = None,
    privateKey: Option[String] = None,
    certificateChain: Option[String] = None,
    serverCertificateName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.iam.CfnServerCertificateProps =
    (new software.amazon.awscdk.services.iam.CfnServerCertificateProps.Builder)
      .path(path.orNull)
      .certificateBody(certificateBody.orNull)
      .privateKey(privateKey.orNull)
      .certificateChain(certificateChain.orNull)
      .serverCertificateName(serverCertificateName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
