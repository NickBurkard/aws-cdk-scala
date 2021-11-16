package io.burkard.cdk.services.transfer

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WorkflowDetailsProperty {

  def apply(
    onUpload: List[_]
  ): software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty =
    (new software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty.Builder)
      .onUpload(onUpload.asJava)
      .build()
}
