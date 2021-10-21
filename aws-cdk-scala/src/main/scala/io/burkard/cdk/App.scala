package io.burkard.cdk

import software.amazon.awscdk.AppProps

/**
 * CDK application, can have one or more stacks.
 * @param props Optional app properties.
 */
abstract class App(props: Option[AppProps] = None)
  extends CdkApp(props.orNull) {

  // Context for initializing one or more stacks.
  protected[this] implicit lazy val appCtx: CdkApp = this

  def main(args: Array[String]): Unit = {
    val _ = synth()
  }
}
